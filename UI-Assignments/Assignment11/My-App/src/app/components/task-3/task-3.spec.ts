import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Task3 } from './task-3';

describe('Task3', () => {
  let component: Task3;
  let fixture: ComponentFixture<Task3>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Task3]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Task3);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
