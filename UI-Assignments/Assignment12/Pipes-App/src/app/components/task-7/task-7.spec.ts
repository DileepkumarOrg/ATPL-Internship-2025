import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Task7 } from './task-7';

describe('Task7', () => {
  let component: Task7;
  let fixture: ComponentFixture<Task7>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Task7]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Task7);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
